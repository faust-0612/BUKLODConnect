<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BUKLOD Connect</title>
    <!-- Optional: link to your CSS -->
    <link rel="stylesheet" href="style.css">
    <!-- Firebase JS SDKs -->
    <script type="module">
      import { initializeApp } from "https://www.gstatic.com/firebasejs/12.1.0/firebase-app.js";
      import { getAnalytics } from "https://www.gstatic.com/firebasejs/12.1.0/firebase-analytics.js";

      const firebaseConfig = {
        apiKey: "YOUR_API_KEY",
        authDomain: "YOUR_PROJECT_ID.firebaseapp.com",
        projectId: "YOUR_PROJECT_ID",
        storageBucket: "YOUR_PROJECT_ID.appspot.com",
        messagingSenderId: "YOUR_SENDER_ID",
        appId: "YOUR_APP_ID",
        measurementId: "YOUR_MEASUREMENT_ID"
      };

      const app = initializeApp(firebaseConfig);
      const analytics = getAnalytics(app);
    </script>
</head>
<body>
    <header>
        <h1>Welcome to BUKLOD Connect</h1>
    </header>

    <main>
        <p>This is your BUKLODConnect app landing page.</p>
        <!-- Add your app content here -->
    </main>

    <footer>
        <p>&copy; 2025 BUKLOD Connect</p>
    </footer>

    <!-- Optional: link to your JS -->
    <script src="main.js"></script>
</body>
</html>
