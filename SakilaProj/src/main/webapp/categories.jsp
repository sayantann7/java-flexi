<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Categories</title>

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

        .search-box { margin-bottom: 30px; }

        input {
            width: 320px;
            padding: 10px 14px;
            border-radius: 8px;
            border: 1px solid #ddd;
            font-size: 14px;
            outline: none;
            margin-bottom: 10px;
        }

        input:focus { border-color: #999; }

        button {
            padding: 10px 16px;
            border-radius: 8px;
            border: none;
            background: #2d2d2d;
            color: white;
            font-size: 14px;
            cursor: pointer;
            transition: 0.2s ease;
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
            width: 350px;
        }

        .grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(220px, 1fr));
            gap: 20px;
        }

        .card {
            background: white;
            padding: 20px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0 2px 10px rgba(0,0,0,0.05);
            transition: 0.2s ease;
        }

        .card:hover {
            transform: translateY(-4px);
            box-shadow: 0 6px 20px rgba(0,0,0,0.08);
        }

        .name { font-weight: 500; }
        .id { font-size: 13px; color: #777; margin-top: 6px; }

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
<h1>Categories</h1>

<!-- Search -->
<div class="search-box">
    <form action="searchCategory">
        <input type="text" name="name" id="searchInput" placeholder="Search categories...">
    </form>
</div>

<!-- Create Category Form -->
<div class="form-card">
    <form action="createCategory" method="post">
        <input type="text" name="name" placeholder="Category Name" required>
        <button type="submit">Add Category</button>
    </form>
</div>

<!-- Category Grid -->
<div class="grid">
    <c:forEach var="category" items="${categories}">
        <div class="card">
            <div class="name">${category.name}</div>
            <div class="id">
                Category ID: ${category.category_id}
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>