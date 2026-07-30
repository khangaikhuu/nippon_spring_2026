console.log("app js working");

const API = "/api";

function loadStudents(query = ""){
	const url = query ? 
	`${API}/students/search=q${encodeURIComponent(query)}` : 
	`${API}/students?limit=20`;
	
	fetch(url)
		.then(response => response.json())
		.then((students) => {
			console.log(students);
			const tbody = document.querySelector("#studentsTable tbody");
			tbody.innerHTML = "";
			
			for (let student of students){
				const tr = document.createElement('tr');
				tr.innerHTML = 
				`<td>${student.id}</td>
					<td>${escapeHtml(student.name)}</td>
					<td>${escapeHtml(student.email)}</td>
					<td>${student.enrolleAt}</td>
				`;
				tbody.appendChild(tr);
			}
			
		})
}

function escapeHtml(str){
	const div = document.createElement("div");
	div.textContent = str;
	return div.innerHTML;
}

loadStudents();