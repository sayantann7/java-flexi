<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movie Management</title>

    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600&display=swap" rel="stylesheet">

    <style>
        body {
            font-family: 'Inter', Helvetica, Arial, sans-serif;
            background-color: #f8f9fb;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            color: #2d2d2d;
        }

        .container {
            text-align: center;
        }

        h1 {
            font-weight: 500;
            margin-bottom: 40px;
            letter-spacing: 0.5px;
        }

        .nav-container {
            display: flex;
            gap: 30px;
            justify-content: center;
        }

        .nav-card {
            width: 220px;
            padding: 30px;
            background: #ffffff;
            border-radius: 14px;
            text-decoration: none;
            color: #2d2d2d;
            box-shadow: 0 2px 12px rgba(0,0,0,0.05);
            transition: transform 0.2s ease, box-shadow 0.2s ease;
        }

        .nav-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 8px 25px rgba(0,0,0,0.08);
        }

        .nav-title {
            font-size: 18px;
            font-weight: 500;
            margin-bottom: 10px;
        }

        .nav-desc {
            font-size: 14px;
            color: #777;
        }
    </style>
</head>

<body>

<div class="container">
    <h1>Movie Dashboard</h1>

    <div class="nav-container">

        <a href="/actors" class="nav-card">
            <div class="nav-title">Actors</div>
            <div class="nav-desc">
                View and manage actor details
            </div>
        </a>

        <a href="/films" class="nav-card">
            <div class="nav-title">Films</div>
            <div class="nav-desc">
                Explore film information
            </div>
        </a>

        <a href="/categories" class="nav-card">
            <div class="nav-title">Categories</div>
            <div class="nav-desc">
                Browse film categories
            </div>
        </a>

    </div>
</div>

</body>
</html>