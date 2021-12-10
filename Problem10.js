const rl = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

const moves = ['rock', 'paper', 'scissors']
let wins = { Computer: 0, Player: 0 }

async function run_game() {
    rl.question(`Enter one of the following (${moves} or exit) > `, move => {
        if (move.toLowerCase() === 'exit') process.exit(this);
        if (!moves.includes(move.toLowerCase())) {
            run_game();
            return;
        }


        const cmp = generateComputerMove()
        const player = moves.indexOf(move.toLowerCase())

        const winner = getWinner(player, cmp);
        wins[winner]++
        console.log("\x1b[34m", `You played: ${move}, Computer played: ${moves[cmp]}`, "\x1b[0m");
        console.log("\x1b[35m", `${winner} has won!\n`, "\x1b[0m");
        console.log("\x1b[33m", `Wins: ${JSON.stringify(wins)}`, "\x1b[0m");

        run_game()
    })

}

function generateComputerMove() {
    return Math.floor(Math.random() * moves.length)
}

function getWinner(i, j) {
    function increment(i) {
        return (i + 1) % moves.length;
    }

    if (j === increment(i)) return 'Computer'
    if (j === i) return 'No one'

    return 'Player'
}

run_game();