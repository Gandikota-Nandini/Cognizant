function submitRegistration() {

    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    name: "Nandini"
                })
            }
        )
        .then(response => response.json())
        .then(data => {

            console.log("Success");

            console.log(data);

        })
        .catch(error => {

            console.log("Failed");

        });

    }, 2000);
}

submitRegistration();