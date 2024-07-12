const myHeading = document.querySelector("h1");
myHeading.textContent = "Hello world!";
document.querySelector("html").addEventListener("click", () => { alert("Ouch!, Stop Poking me!");});

const myImage = document.querySelector("img");
myImage.onclick = () => {
    const mySrc = myImage.getAttribute("src");
    if(mySrc === "images/ronaldo.jpeg"){
        myImage.setAttribute("src", "images/Henry.jpeg");
    }else {
        myImage.setAttribute("src", "images/ronaldo.jpeg");
    }
};





//onclick()  //addEventListener()
//.alert()  //setAttribute //getAttribute()