async function loadEvents() {

    console.log("Loading...");

    try {
        const response = await fetch("events.json");

        const data = await response.json();

        console.log(data);

    } catch (error) {
        console.log(error);
    }
}

loadEvents();