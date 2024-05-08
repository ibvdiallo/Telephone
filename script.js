let menu = document.getElementById("menu");
const  Fermer = "Fermer"
const Ouvrir = "Menu"
let side_bar = document.getElementById("side_bar");
menu.addEventListener("click", (e) => {
    let bar = side_bar
    let content = document.getElementById("content");
    if (menu.textContent===Fermer){
        menu.innerHTML = Ouvrir
        content.classList.replace('col-10', 'col-12');
        bar.classList.replace('col-2', 'col-0');
        bar.style.transition='all 400ms'
        content.style.transition='all 400ms'
    }else{

        menu.textContent=Fermer
        content.classList.replace('col-12', 'col-10');
        bar.classList.replace('col-0', 'col-2');
        bar.style.transition='all 400ms'
        content.style.transition='all 400ms'
    }


})
