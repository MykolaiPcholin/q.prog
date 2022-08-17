import Worker from "./worker.js";

//
const workers = [];

const btn = document.getElementById("Worker");

btn.onclick = () => {
  console.log("function is working");
  workers.push(new Worker(
    prompt("input name"),
    prompt("input sname"),
    prompt("input age"),
    prompt("input phone")
  ));
  stateWorkers();
}

function stateWorkers() {
  console.dir(workers);
}