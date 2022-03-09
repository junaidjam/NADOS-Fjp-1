const fs = require("fs");
let inputArr = process.argv.slice(2);
// console.log(inputArr);

let filesArr = [];
let optionsArr = [];

//placed files path in the array
for(let i = 0;i< inputArr.length;i++){
    let firstChar = inputArr[i].charAt(0);
    if (firstChar == '-'){
        optionsArr.push(inputArr[i]);
    }
    else{
        filesArr.push(inputArr[i]);
    }
}

// console.log("file to be read are" +filesArr);

//check if all the files re present
for(let i = 0;i<filesArr.length;i++){
    let doesExist = fs.existsSync(filesArr[i]);
    if(!doesExist){
        console.log("Files does not exist");
        return;
    }
}

//content read and appending starts
let content = "";
for(let i =0;i< filesArr.length;i++){
    let fileContent = fs.readFileSync(filesArr[i]);
    content += fileContent+ "\n";
}
console.log(content);

let contentArr = content.split("\r\n");
console.log(contentArr);