<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Films</title>

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

        .film-list {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .card {
            background: white;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.05);
            transition: 0.2s ease;
        }

        .card:hover {
            transform: translateY(-4px);
            box-shadow: 0 6px 20px rgba(0,0,0,0.08);
        }

        .title {
            font-size: 18px;
            font-weight: 500;
            margin-bottom: 8px;
        }

        .meta {
            font-size: 14px;
            color: #777;
            margin-bottom: 12px;
        }

        .desc {
            font-size: 14px;
            line-height: 1.6;
            color: #555;
        }

        .badge {
            margin-top: 12px;
            display: inline-block;
            padding: 4px 10px;
            font-size: 12px;
            background: #eef1f6;
            border-radius: 20px;
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
<h1>Films</h1>

<div class="film-list">
    <c:forEach var="film" items="${films}">
        <div class="card">
            <div class="title">${film.title}</div>
            <div class="meta">
                ${film.release_year} • ${film.length} mins
            </div>
            <div class="desc">
                ${film.description}
            </div>
            <div class="badge">
                Rating: ${film.rating}
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>