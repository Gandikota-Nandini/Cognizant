const container = document.querySelector("#eventContainer");

const card = document.createElement("div");

card.textContent = "Music Fest";

container.appendChild(card);

function updateSeats() {
    card.textContent = "Music Fest - Registered";
}