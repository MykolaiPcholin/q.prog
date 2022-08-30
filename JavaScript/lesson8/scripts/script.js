document.querySelector("#button").onclick = () => {
  const btn1 = document.getElementById("button")
  let input = document.createElement("input");
  input.setAttribute("type", "number");
  input.setAttribute("placeholder", "Input diameter");
  btn1.after(input);

  const btn2 = document.createElement("input");
  btn2.setAttribute("type", "button");
  btn2.setAttribute("value", "Draw");
  input.after(btn2);

  btn2.onclick = () => {
    for (let i = 0; i < 10; i++) {
      let circleArea = document.createElement("div");
      circleArea.setAttribute("class", "circle-area");
      circleArea.style.cssText = `display:flex`;

      btn2.after(circleArea);

      for (let j = 0; j < 10; j++) {
        let circle = document.createElement("div");
        circle.setAttribute("class", "circle-area__circle")
        circle.style.cssText = `
          width: ${input.value}px;
          height: ${input.value}px;
          background-color: hsl(${Math.floor(Math.random() * 360)}, 50%, 50%);
          margin: 10px;
          border-radius: 50%;
        `;

        circleArea.append(circle);
      }
    }
    
    let[...circles]=document.querySelectorAll(".circle-area__circle");
		  circles.forEach(element => {
			  element.onclick= () => {
			  element.remove();
			};	  
		});
  }
}
