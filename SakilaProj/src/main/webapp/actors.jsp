<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Actors</title>

    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600&display=swap" rel="stylesheet">

    <style>
        body {
            font-family: 'Inter', Helvetica, Arial, sans-serif;
            background: #f8f9fb;
            margin: 0;
            padding: 40px;
            color: #2d2d2d;
        }

        h1 {
            font-weight: 500;
            margin-bottom: 30px;
        }

        .grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
            gap: 20px;
        }

        .card {
            background: white;
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.05);
            transition: 0.2s ease;
        }

        .card:hover {
            transform: translateY(-4px);
            box-shadow: 0 6px 20px rgba(0,0,0,0.08);
        }

        .name {
            font-weight: 500;
            font-size: 16px;
        }

        .id {
            font-size: 13px;
            color: #777;
            margin-top: 6px;
        }

        .back {
            display: inline-block;
            margin-bottom: 25px;
            text-decoration: none;
            font-size: 14px;
            color: #555;
        }
    </style>
</head>

<body>

<a href="/" class="back">Back</a>
<h1>Actors</h1>

<div class="grid">
    <c:forEach var="actor" items="${actors}">
        <div class="card">
            <div class="name">
                ${actor.first_name} ${actor.last_name}
            </div>
            <div class="id">
                Actor ID: ${actor.actor_id}
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>