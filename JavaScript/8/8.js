document.getElementById("registerBtn").onclick = () => {
    alert("Registered Successfully");
};

document.getElementById("category").onchange = function () {
    console.log(this.value);
};

document.getElementById("searchBox").addEventListener(
    "keydown",
    function (e) {
        console.log(e.key);
    }
);