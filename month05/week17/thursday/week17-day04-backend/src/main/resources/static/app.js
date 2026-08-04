console.log("app js working");

const API = "/api";

function loadStudents(query = "") {
    const url = query ?
        `${API}/students/search=q${encodeURIComponent(query)}` :
        `${API}/students?limit=20`;

    fetch(url)
        .then(response => response.json())
        .then((students) => {
            console.log(students);
            const tbody = document.querySelector("#studentsTable tbody");
            tbody.innerHTML = "";

            for (let student of students) {
                const tr = document.createElement('tr');
                tr.innerHTML =
                    `<td>${student.id}</td>
					<td>${escapeHtml(student.name)}</td>
					<td>${escapeHtml(student.email)}</td>
					<td>${student.enrolleAt}</td>
					<td>
						<button class="delete-btn" data-id="${student.id}" 
							onClick="deleteStudent(this)">Delete</button>
					</td>
				`;
                tbody.appendChild(tr);
            }

        })
}

document.querySelector("#studentsTable tbody").addEventListener("click", (e) => {
    if (!e.target.classList.contains("delete-btn")) return;

    const id = e.target.dataset.id;
    console.log(id);

    if (!confirm(`Do you really want to delete Student with id=${id}?`)) return;

    fetch(`${API}/students/${id}`, {
        method: "DELETE"
    }).then((response) => response.json())
        .then((data) => {
            console.log(data);
            loadStudents();
        }).catch((error) => console.error(error));

});

function deleteStudent(e) {
	console.log(e.dataset.id);
}


document.getElementById('addBtn').addEventListener('click', () => {
    const studentName = document.getElementById('name').value.trim();
    const studentEmail = document.getElementById('email').value.trim();

    if (!studentEmail || !studentName) {
        return alert('Name and Email Required!');
    }

    fetch(`${API}/students`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ name: studentName, email: studentEmail })
    }).then(response => response.json())
        .then((data) => {
            console.log(data);
            document.getElementById('name').value = "";
            document.getElementById("email").value = "";
            loadStudents();
        }).catch(error => console.error(error));

})




function escapeHtml(str) {
    const div = document.createElement("div");
    div.textContent = str;
    return div.innerHTML;
}

loadStudents();