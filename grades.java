<html>
<body>
<script>
let A= 90 or above;
let B= 80-89;
let C= 70-79;
let D= 60-69;
let F= below 60;

var score = 85;


function calculateGrade(score) {
    if (score >= 90) {
        console.log("A grade");
    } else if (score >= 80 && score <= 89) {
        console.log("B grade");
    } else if (score >= 70 && score <= 79) {
        console.log("C grade");
    } else if (score >= 60 && score <= 69) {
        console.log("D grade");
    } else {
        console.log("F grade");
    }
}


calculateGrade(score);
</script>
</body>
</html>
