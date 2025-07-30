function toogleclose() {
    document.getElementById("nml").style.display = "none";
}

function toogle() {
    document.getElementById("nml").style.display = "flex";
}

// Reset display on window resize
window.addEventListener("resize", function () {
    const element = document.getElementById("nml");
   
    // Example breakpoint: 768px for mobile vs desktop
    if (window.innerWidth > 1100) {
        // Reset inline style so CSS can take over
        element.style.display = "";
       
    }
});

const hero_images=["https://img.freepik.com/premium-vector/children-going-school-kids-classroom-people-vector-illustration_169479-482.jpg?ga=GA1.1.1272954277.1744944868&semt=ais_hybrid&w=740",
    "https://img.freepik.com/free-vector/college-campus-concept-illustration_114360-10538.jpg?ga=GA1.1.1272954277.1744944868&semt=ais_hybrid&w=740",    "https://img.freepik.com/free-vector/flat-background-back-school-season_23-2150557012.jpg?ga=GA1.1.1272954277.1744944868&semt=ais_hybrid&w=740",
    "https://img.freepik.com/free-vector/back-school-teacher-concept-illustration_114360-22588.jpg?ga=GA1.1.1272954277.1744944868&semt=ais_hybrid&w=740",
    "https://img.freepik.com/premium-vector/colorful-vector-illustration-icon-students-entering_1120554-40266.jpg?ga=GA1.1.1272954277.1744944868&semt=ais_hybrid&w=740",
    "https://img.freepik.com/premium-vector/children-go-school-flat-design-concept-with-people-characters-scene_9209-4711.jpg?ga=GA1.1.1272954277.1744944868&semt=ais_hybrid&w=740"];

    let hero_section=document.getElementsByClassName("hero-section-img")[0];
    let index=0;
    function slide_show(){
        hero_section.src=`${hero_images[index]}`;
        index = (index + 1) % hero_images.length;

    }
    setInterval(slide_show,6000);


//     const latest_news=["this is info 1","this is info 2", "this is info 3","this is info 1","this is info 2", "this is info 3","this is info 1","this is info 2", "this is info 3"];
//    const latest_news_container=document.getElementsByClassName("moving-news-section-latest-news-content")[0];
//    latest_news.forEach((p)=>{
//     const latest_news_item=document.createElement("span");
//     latest_news_item.classList.add("scroll-item kanit-bold");
//     latest_news_item.textContent=p;
//     latest_news_container.appendChild(latest_news_item);
//    });
  
window.onload = function() {
  const latest_news = ["Tie up with Vhbuyio group ",
    "Admission Open Apply Now ", 
    "Our 20 students score 99% marks in 12th board",
    "Our 30 students score 99% marks in 10th board"
    ,"Smart Lab And Classes Are Available ",
     "Transporation Serivices Are Available ",
     "Our School won 2 Trophies At National Level",
     "100% ScholarShip Available for Student with army background",
      "10% ScholarShip is Available for all State Level Candidate "];


  const latest_news_container = document.querySelector(".moving-news-section-latest-news-content");

  latest_news.forEach((p) => {
    const span = document.createElement("span");
    span.classList.add("scroll-item", "kanit-medium","tc");
    const a=document.createElement("a");
    a.classList.add( "tc");
    a.href="#";
    a.textContent=p;
    span.appendChild(a);
    latest_news_container.appendChild(span);
  });
}
let get_year=new Date();
let year=get_year.getFullYear();
document.getElementById("current_year").textContent=year;



















































































// document.addEventListener("contextmenu", e => e.preventDefault()); // Disable right-click
//   document.onkeydown = function (e) {
//     if (
//       e.key === "F12" || // Dev Tools
//       (e.ctrlKey && e.shiftKey && e.key === "I") || // Ctrl+Shift+I
//       (e.ctrlKey && e.shiftKey && e.key === "J") || // Ctrl+Shift+J
//       (e.ctrlKey && e.key === "U") || // View source
//       (e.ctrlKey && e.key === "S") // Save page
//     ) {
//       return false;
//     }
//   };