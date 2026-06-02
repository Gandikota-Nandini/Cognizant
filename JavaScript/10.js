const displayEvent = (
    eventName = "Unknown Event"
) => {
    console.log(eventName);
};

const event = {
    name: "Music Fest",
    seats: 20
};

const { name, seats } = event;

console.log(name);
console.log(seats);

const events = [1, 2, 3];

const clone = [...events];

console.log(clone);