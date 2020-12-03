let http=require("http");
const httpServer=http.createServer(fun);
function fun(req,res)
{
if(req.url==='/')
{
    console.log('fun is calling........')
res.writeHead(200);
res.write('hello world');
res.write(JSON.stringify({
    name:'ram',
    surname:'sonti',
    age:23
}))
res.end();
}
}
httpServer.listen(3000);
module.exports=httpServer;
