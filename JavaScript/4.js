const eventsList = [];

function addEvent(event) {
    eventsList.push(event);
}

function registerUser(eventName) {
    console.log(`Registered for ${eventName}`);
}

function filterEventsByCategory(category, callback) {
    const result = callback(category);
    return result;
}

function registrationTracker() {
    let total = 0;

    return function () {
        total++;
        return total;
    };
}

const musicCounter = registrationTracker();

console.log(musicCounter());
console.log(musicCounter());

addEvent({ name: "Music Fest", category: "Music" });

const filtered = filterEventsByCategory(
    "Music",
    cat => eventsList.filter(e => e.category === cat)
);

console.log(filtered);