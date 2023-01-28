const buttoncalled=document.getElementById("button");
buttoncalled.addEventListener('click', submit)
const getButtoncalled=document.getElementById("get");
getButtoncalled.addEventListener('click', get)

function submit(){
    let name1=document.getElementById("course").value;
    let name2=document.getElementById("degree").value;
    let name3=document.getElementById("email").value;
    let name4=document.getElementById("graduation_year").value;
    let name5=document.getElementById("mobile").value;
    let name6=document.getElementById("name").value;
    let request = new Request('http://localhost:8080/students',{
        headers: new Headers({
            
            'Content-type': 'application/json'
        }),
        method: 'POST',
        body: JSON.stringify({
            "course": name1,
            "degree": name2,
            "email": name3,
            "graduation_year": name4,
            "mobile": name5,
            "name": name6
        })
});
fetch(request).then((response)=>{
    console.log(response);
    response.json().then((data)=>{
        console.log(data);
    })
})
}