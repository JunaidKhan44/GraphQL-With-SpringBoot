--------------Query endpoints---------------
query{
   allBooks{
    id
    title
    desc
}
}
--------
query{
    getBook(bookId:1){
        title
        desc
    }
}

--------
mutation{
    createBook(book:{
        title:"DDS",
        desc:"Data Structure",
        price:22.00,
        pages:123,
        author:"KJ"
    }){
        id
    }
}
--------
