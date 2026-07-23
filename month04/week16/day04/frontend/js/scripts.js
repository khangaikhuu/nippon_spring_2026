const mainElement = document.querySelector("main");

// menu
const menuUlELement = document.createElement("ul");
// class menu add
menuUlELement.classList.add("menu");

const liElementCollection = [
  "Home",
  "FIFA2026",
  "Policy",
  "Ecomony",
  "Society",
  "Health",
];

for (let i = 0; i < liElementCollection.length; i++) {
  const liElement = document.createElement("li");
  liElement.innerText = liElementCollection[i];
  liElement.classList.add("sub-menu");
  menuUlELement.appendChild(liElement);
}
console.log(menuUlELement);

// add to main element
mainElement.appendChild(menuUlELement);

// Шинээр button элемент үүсгээд түүнийг Aside нэмэх гэж бичнэ. Түүн дээр actionListener дээр нь
// click болоход шинээр main дээр aside нэртэй элемент үүсгэдэг байна.
// Тэгээд түүн дээр aside гэдэг класстай болгоорой. Дотор нь ASIDE menu гэсэн үгтэй болгоорой.
// CSS дээрээ aside class дээр дизайн оруулна уу
const asideButton = document.createElement("button");
asideButton.textContent = "Aside add";

asideButton.addEventListener("click", () => {
  // TODO
  const existingAsideElement = mainElement.querySelector('aside.aside');

  if (!existingAsideElement) {
    const asideElement = document.createElement("aside");
    asideElement.classList.add("aside");
    asideElement.textContent = "Aside Menu";
    mainElement.appendChild(asideElement);
  } else {
    mainElement.removeChild(existingAsideElement);
  }
});

mainElement.appendChild(asideButton);
// article element нэмээд өөр өнгөөр харуулаарай. Үндсэн өргөнийхөө 70%-ийг эзэлнэ
// display flex ашиглана. 