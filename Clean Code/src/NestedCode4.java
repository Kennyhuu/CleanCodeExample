public class NestedCode4 {
    class Bad_Nested_Code {
        public void guessAvenger(Object avenger) {
            if (avenger.sex == "M" && avenger.age < 80 && avenger.canFly && avenger.skinColor.includes("white")) {
                console.log("Iron Man");
            } else if (avenger.sex == "M" && avenger.age > 1000 && avenger.canFly && avenger.skinColor.includes("white")) {
                console.log("Thor");
            } else if (avenger.sex == "M" && avenger.age < 80 && !avenger.canFly && (avenger.skinColor.includes("white") || avenger.skinColor.includes("green"))) {
                console.log("Hulk");
            } else if (avenger.sex == "F" && avenger.age < 80 && !avenger.canFly && avenger.skinColor.includes("white")) {
                console.log("Black Widow");
            } else if (avenger.sex == "M" && avenger.age > 80 && avenger.age < 120 && !avenger.canFly && avenger.skinColor.includes("white")) {
                console.log("Captain America");
            } else if (avenger.sex == "M" && avenger.age < 80 && !avenger.canFly && avenger.skinColor.includes("black")) {
                console.log("Nick Fury");
            } else if (avenger.sex == "M" && avenger.age < 80 && avenger.canFly && avenger.skinColor.includes("black")) {
                console.log("Falcon");
            }
        }
    }

    class Good_Nested_Code {
        class Initilizer {
            // Initialization and constructor
            public void isMale() {
                return this.sex == "M";
            }

            public void canFly() {
                return this.canFly;
            }

            public void canChangeColor() {
                return this.skinColor.length > 1;
            }

            public void isWhite() {
                return this.skinColor.includes("white");
            }

            public void isBlack() {
                return this.skinColor.includes("black");
            }

            public void isAncient() {
                return this.age >= 1000;
            }

            public void isOld() {
                return this.age > 80 && this.age < 1000;
            }
        }

        class Guess_Avenger {
            public void guessAvenger(Object avenger) {
                if (avenger.canChangeColor()) {
                    console.log("Hulk");
                    return;
                }
                if (!avenger.isMale()) {
                    console.log("Black Widow");
                    return;
                }
                if (avenger.isAncient()) {
                    console.log("Thor");
                    return;
                }
                if (avenger.isOld()) {
                    console.log("Captain America");
                    return;
                }
                if (avenger.isBlack()) {
                    if (avenger.canFly()) {
                        console.log("Falcon");
                    } else {
                        console.log("Nick Fury");
                    }
                    return;
                }
                if (avenger.isWhite()) {
                    console.log("Iron Man");
                    return;
                }
                console.log("This is not an Avenger!");
            }
        }
    }
}
