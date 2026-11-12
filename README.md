# My-Ecommerce-Backend

Spring Boot 3.4 (Java 21) REST API for the ecommerce store: auth with JWT, products, cart, orders, and Razorpay payment links. The React frontend is in the My-Ecommerce-FrontEnd repo.

## Setup

1. Copy `.env.example` to `.env` and fill in the values. `.env` is gitignored.
2. Start a MySQL 8 database that matches `DB_URL`. Tables are created on startup.
3. Export the variables and run:

```bash
set -a; source .env; set +a
./mvnw spring-boot:run
```

The API listens on http://localhost:8485.

| Variable | Purpose |
|---|---|
| `RAZORPAY_KEY_ID`, `RAZORPAY_KEY_SECRET` | Razorpay API keys (test mode keys work) |
| `DB_URL`, `DB_USERNAME`, `DB_PASSWORD` | MySQL connection |
| `JWT_SECRET` | Signs login tokens. Use a random string of 32+ characters |
