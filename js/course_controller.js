class ItemsController {
    
    // Set up the items and currentId property in the contructor
    constructor(currentId) {
        this.items = [];
        this.currentId = ++currentId;
     
    }

    // Create the addItem method
    addItem(itemsfromhtml) {
        
        var temp= itemsfromhtml;
        
        temp.id=this.currentId;
        console.log(temp);
        
        
       console.log(this.items);
        this.items.push(temp);
        console.log("after adding current id"+ this.items);
        var x= JSON.stringify(this.items);
        localStorage.setItem("items", JSON.stringify(this.items));
       
      

    }
      display()

     {  
        for(var i = 0, size = this.items.length; i < size ; i++){
            const item = this.items[i];
           
        
        
        console.log('indisplay');
        console.log(item);
        const itemHTML = '<div class="card" style="width: 350px;">\n' +
        '    <img src="'+item.img +'" width="300" height="250"  alt="product image">\n' +
        '    <div class="card-body">\n' +
        '        <h5 class="card-title">'+item.pname+'</h5>\n' +
        '        <p class="card-text">'+item.price+'</p>\n' +
        '        <a href="#" class="btn btn-primary">Added This Course Item</a>\n' +
        '    </div>\n' +
        '</div>\n' +
        '<br/>';
    const itemsContainer = document.getElementById("list-items");
    itemsContainer.innerHTML += itemHTML;
     }
    
    } 
}