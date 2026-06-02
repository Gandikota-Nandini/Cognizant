let eventsArray = [];

eventsArray.push({
    name: "Music Fest",
    category: "Music"
});

eventsArray.push({
    name: "Baking Workshop",
    category: "Workshop"
});

const musicEvents = eventsArray.filter(
    event => event.category === "Music"
);

console.log(musicEvents);

const cards = eventsArray.map(
    event => `Workshop on ${event.name}`
);

console.log(cards);