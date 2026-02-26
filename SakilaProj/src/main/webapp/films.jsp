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

        h1 { font-weight: 500; margin-bottom: 20px; }

        .search-box { margin-bottom: 20px; }

        input, textarea, select {
            width: 320px;
            padding: 10px 14px;
            border-radius: 8px;
            border: 1px solid #ddd;
            font-size: 14px;
            outline: none;
            margin-bottom: 10px;
            font-family: inherit;
        }

        textarea {
            resize: vertical;
            min-height: 80px;
        }

        input:focus, textarea:focus, select:focus {
            border-color: #999;
        }

        button {
            padding: 10px 16px;
            border-radius: 8px;
            border: none;
            background: #2d2d2d;
            color: white;
            font-size: 14px;
            cursor: pointer;
            transition: 0.2s ease;
            margin-left: 5px;
        }

        button:hover {
            background: #444;
        }

        .form-card {
            background: white;
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.05);
            margin-bottom: 40px;
            width: 360px;
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

        .title { font-size: 18px; font-weight: 500; margin-bottom: 8px; }
        .meta { font-size: 14px; color: #777; margin-bottom: 10px; }
        .desc { font-size: 14px; line-height: 1.6; color: #555; }

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
            margin-bottom: 20px;
            text-decoration: none;
            font-size: 14px;
            color: #555;
        }
    </style>
</head>

<body>

<a href="/" class="back">Back</a>

<h1>Add a Film</h1>
<!-- Create Film Form -->
<div class="form-card">
    <form action="createFilm" method="post">

        <input type="text" name="title" placeholder="Title" required>

        <textarea name="description" placeholder="Description" required></textarea>

        <input type="number" name="release_year" placeholder="Release Year" required>

        <input type="number" name="length" placeholder="Length (minutes)" required>

        <select name="rating" required>
            <option value="" disabled selected>Select Rating</option>
            <option value="G">G</option>
            <option value="PG">PG</option>
            <option value="PG-13">PG-13</option>
            <option value="R">R</option>
            <option value="NC-17">NC-17</option>
        </select>

        <select name="categoryId" required>
            <option value="" disabled selected>Select Category</option>
            <c:forEach var="category" items="${categories}">
                <option value="${category.category_id}">
                    ${category.name}
                </option>
            </c:forEach>
        </select>

        <button type="submit">Add Film</button>
    </form>
</div>

<h1>Films</h1>

<!-- Search by Name -->
<div class="search-box">
    <form action="searchFilm" method="get">
        <input type="text" name="name" placeholder="Search films...">
        <button type="submit">Search</button>
    </form>
</div>

<!-- Filter By Category -->
<div class="search-box">
    <form action="filterFilmByCategory">
        <select name="categoryId" required>
            <option value="" disabled selected>Filter by Category</option>
            <c:forEach var="category" items="${categories}">
                <option value="${category.category_id}">
                    ${category.name}
                </option>
            </c:forEach>
        </select>
        <button type="submit">Filter</button>
    </form>
</div>

<!-- Film List -->
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