let btnAjouter = document.getElementById("btn-ajouter");
let listeTache = document.getElementById("liste_taches");
let nbId = 0

btnAjouter.addEventListener("click", function (event) {
    let tache = document.getElementById("tache");
    if (tache && tache.value.length > 0) {
        const  tr = createElement(++nbId,tache.value)
        listeTache.appendChild(tr)
    }
})
function createElement(name, tache){
    const tr = document.createElement("tr");

    const id = document.createElement("td");
    id.innerHTML = tache
    const nom = document.createElement("td");
    nom.innerHTML = name
    const action = document.createElement("td");

    const btn_modifier = document.createElement("button");
    btn_modifier.innerHTML = "Modifier"
    const btn_supprimer = document.createElement("button");
    btn_supprimer.innerHTML = "Supprimer"

    action.appendChild(btn_supprimer);
    action.appendChild(btn_modifier);

    tr.appendChild(nom);
    tr.appendChild(id);
    tr.appendChild(action);

    return tr;

}
