const express = require("express");
const swaggerJsdoc = require("swagger-jsdoc");
const swaggerUi = require("swagger-ui-express");
const postRoutes = require("./routes/postRoutes");
const sequelize = require("./config/database");
require("dotenv").config();
const OS = require("os");

process.env.UV_THREADPOOL_SIZE = OS.cpus().length;
console.log("process.env.UV_THREADPOOL_SIZE: ", process.env.UV_THREADPOOL_SIZE);

const app = express();
app.use(express.json());

const swaggerOptions = {
  definition: {
    openapi: "3.0.0",
    info: {
      title: "Posts API",
      version: "1.0.0",
      description: "A simple Posts API",
    },
    servers: [
      {
        url: "http://localhost:3000",
      },
    ],
  },
  apis: ["./src/routes/*.js"],
};

const swaggerSpec = swaggerJsdoc(swaggerOptions);
app.use("/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerSpec));

app.use("/api/posts", postRoutes);

const PORT = process.env.PORT || 3000;

// sequelize.drop().then(() => {
//   console.log("Database synchronized.");

// });

sequelize.sync().then(() => {
  app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
  });
});
