console.log("Promise ");

const promise = new Promise(function (resolve, reject) {
  resolve("success");
});
console.log(promise);

// Network хүсэлт илгээх

const rejectedPromise = new Promise((resolve, reject) => {
  reject("failed");
});
// failed гэдэг promise rejection үүсгэнэ үү

console.log(rejectedPromise);

// p гэдэг нэртэй Promise object үүсгэнэ үү-
// promise body дотор score = 100 гэдэг констант хувьсагч тодорхойлно
// хэрвээ score > 50 их бол you win! гэж resolve хийнэ үү
// хэрвээ score < 50 бол you lose! гэж reject хийнэ үү.
//  promise ямар төлөвтэй байна вэ?
// ямар утганд you win!, ямар утганд you lose! гэж гарч байна вэ?

const p = new Promise((resolve, reject) => {
  const score = 60;
  if (score > 50) {
    resolve("You win!");
  } else {
    reject("You lose");
  }
});

console.log(p);
// chain
p.then((value) => {
  console.log(value);
}).catch((error) => {
    console.error(error);
}); 

// Exercise
// loadScore гэдэг promise үүсгээд түүнийгээ хэрвээ score нь 0-оос их бол score
// хэвлэдэг харин бага бол Invalid score гэж алдаа заадаг болгоорой.
const loadScore = new Promise((resolve, reject) => {
    const score = 43000;
    if (score > 0 ){
        resolve(score);
    } else {
        reject("Invalid score");
    }
});

loadScore.then((v) => {
    console.log(v);
}).catch(e => {
    console.error(e);
})
const players = ["Bat", "Saraa", "Bold"];

console.log(players);
console.table(players);

function wait(ms) {
    return new Promise(function(resolve, reject) {
        setTimeout(()=> {
            resolve("Waited " + ms + "ms");
        }, ms);
    });
}

console.log(wait(2000));

wait(2000).then(function(msg){
    console.log(msg);
});

// fetchPlayer гэдэг нэртэй фунцк нь name параметр авдаг байна.
// promise буцаана
// promise body дотор setTimeout нь 1000мс буюу 1секундын дараа ажиллана
//  Math.random() функц ашиглан хэрвээ энэхүү утга нь 0.3 секундээс их бол
// {name: name, score: 1500} гэж resolve хийнэ
// үгүй бол "Server error: could not load " + name гэж reject хийнэ
// Тестлэхдээ  "Bat" гэдэг утга өгөөд
// "Bat has 1200 points" гэж хэвлэдэг болгоно уу
// Тэгээд бусад үед error catch авдаг болгоорой. 
function fetchPlayer(name){
    return new Promise((resolve, reject) => {
        setTimeout(function(){
            if(Math.random() > 0.3) {
                resolve({name: name, score: 1500});
            } else {
                reject("Server error: could not load " + name);
            }
        },1000)
    })
}

fetchPlayer("Bat")
    .then((player) => {
        console.log(player.name + " has " + player.score + " points");
    })
    .catch((error) => {
        console.error(error);
    });