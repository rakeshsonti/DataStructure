const express=require('express');
const app=express();
app.get('/contact',(req,res)=>{
res.writeHead(200,{
    "content-type":"text/plain",
    "id":123,
});
res.write('ram is great');
console.log('ending the express function..........');
res.end();
})
app.listen(3000);