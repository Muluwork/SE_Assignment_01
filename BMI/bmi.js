var express = require("express");
var bodyParser = require("body-parser");
var app = express();
var fs = require('fs');


app.use(express.static(__dirname+"/publics"));

var port = process.env.PORT || 4040;

var urlencodedParser = bodyParser.urlencoded({extended:false});
app.use(bodyParser.urlencoded({extended:true}));

app.get('/', function(req, res){
    
    
        //     res.send("Homepage");
        res.sendFile(__dirname+"/publics/bmi.html"); 
    });


    app.post('/calculateBmi', function(req, res){
        
        console.log("am in calculateBmi");
           var info = req.body;
           console.log(info);

           var weight = info.weight;
           console.log(weight);
           var height = info.height;
           var bmi =weight/(height*height);
           var nbmi = String(bmi);
           res.send({data : nbmi});

        //    if(bmi <= 18){
        //        res.end("your bmi is "+bmi+": under weight");
        //    }else if(bmi >= 30){
        //     res.end("your bmi is "+bmi+" : over weight"); 
        //    }else{
        //     res.end("your bmi is "+bmi+": normal");
        //    }

        });
        app.listen(port, function(){
            
                console.log("Server is up at 7000");
            });