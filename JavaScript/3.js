const events = [
    { name: "Music Fest", seats: 20, upcoming: true },
    { name: "Dance Show", seats: 0, upcoming: true },
    { name: "Old Event", seats: 10, upcoming: false }
];

events.forEach(event => {
    if (event.upcoming && event.seats > 0) {
        console.log(event.name);
    }
});

function register(event) {
    try {
        if (event.seats <= 0) {
            throw new Error("No Seats Available");
        }

        event.seats--;
        console.log("Registration Successful");

    } catch (error) {
        console.log(error.message);
    }
}

register(events[0]);
register(events[1]);