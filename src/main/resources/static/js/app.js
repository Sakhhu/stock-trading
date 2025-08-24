// Simple JS to simulate stock market data
document.addEventListener("DOMContentLoaded", function () {
    const marketDataDiv = document.getElementById("market-data");

    // Example stock data (later you can fetch from API)
    const stocks = [
        { symbol: "AAPL", price: 189.56 },
        { symbol: "GOOGL", price: 2765.21 },
        { symbol: "TSLA", price: 735.50 }
    ];

    // Display stock data
    function renderMarket() {
        marketDataDiv.innerHTML = "";
        stocks.forEach(stock => {
            const p = document.createElement("p");
            p.textContent = `${stock.symbol} - $${stock.price.toFixed(2)}`;
            marketDataDiv.appendChild(p);
        });
    }

    renderMarket();

    // Handle trade form
    const form = document.getElementById("trade-form");
    form.addEventListener("submit", function (e) {
        e.preventDefault();

        const symbol = document.getElementById("symbol").value.toUpperCase();
        const quantity = parseInt(document.getElementById("quantity").value);

        alert(`✅ Trade placed: Buy ${quantity} shares of ${symbol}`);
    });
});
