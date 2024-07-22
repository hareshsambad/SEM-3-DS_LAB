const http = require('http');

const server = http.createServer((req, res) => 
{
    const url = req.url;
    
    if(url == "/home")
    {
        res.write("Home url");
        res.end();

    }
    if(url == "/about")
    {
        res.write("About url");
        res.end();

    }
    if(url == "/Service")
    {
        res.write("Service url");
        res.end();

    }
    if(url == "/Help")
    {
        res.write("Help url");
        res.end()

    }
    if(url == "/Contact Us")
    {
        res.write("Contact Us url");
        res.end();

    }
    
});

server.listen(3000,()=>console.log("Server Started 3000 : "));
