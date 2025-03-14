<%@page contentType="text/html;charset=UTF-8" language="java"%>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <title>Form</title>
    <link rel="stylesheet" href="./css/register.css">
</head>
<body>
    <div class="body-container">
        <div class="container-fluid content">
            <div class="container" id="main-container">
                <img src="./images/logo.svg" height="80px">
                <div class="row">
                    <div class="col">
                        <h2 class="text-start mb-4">Register New Account</h2>
                        <p>By registering with us, you agree to our <a class="link text-decoration-none" href="">
                                Terms & Regulations</a></p>
                    </div>
                    <div class="col">
                        <form action="processForm" method="post">
                            <div class="mb-4 row">
                                <div class="col-12 col-lg-6 mb-4 mb-lg-0">
                                    <div class="form-floating">
                                        <input type="text" class="form-control" id="f_name" name="f_name"
                                            placeholder="First Name" required>
                                        <label for="f_name">First Name</label>
                                        <div class="error-message" id="f_name_error"></div>
                                    </div>
                                </div>
                                <div class="col-12 col-lg-6">
                                    <div class="form-floating">
                                        <input type="text" class="form-control" id="l_name" name="l_name"
                                            placeholder="Last Name" required>
                                        <label for="l_name">Last Name</label>
                                        <div class="error-message" id="l_name_error"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="mb-4">
                                <div class="form-floating">
                                    <input type="email" class="form-control" id="email" name="email"
                                        placeholder="Email Address" required>
                                    <label for="email">Email Address</label>
                                    <div class="error-message" id="email_error"></div>
                                </div>
                            </div>
                            <div class="mb-4">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="phone_no" name="phone_no"
                                        placeholder="Phone Number" pattern="[0-9]{3}-[0-9]{7,11}" required>
                                    <label for="phone_no">Phone Number</label>
                                    <div class="error-message" id="phone_no_error"></div>
                                </div>
                            </div>
                            <div class="mb-4">
                                <div class="form-floating">
                                    <input type="password" class="form-control" id="password" name="password"
                                        placeholder="Password" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*?,]).{8,}$" required>
                                    <label for="password">Password</label>
                                    <div class="error-message" id="password_error"></div>
                                </div>
                            </div>
                            <div class="mb-4">
                                <div class="form-floating">
                                    <input type="password" class="form-control" id="c_password" name="c_password"
                                        placeholder="Confirm Password" required>
                                    <label for="c_password">Confirm Password</label>
                                    <div class="error-message" id="c_password_error"></div>
                                </div>
                            </div>
                            <div class="text-start" id="submit-container">
                                <button type="submit" class="btn btn-primary mt-3" id="submit-button" disabled>Submit Disabled</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="sub-container">
            <p class="ps-4">&copy; 2025 XYZ Solutions Pte. Ltd. All Rights Reserved</p>
        </div>
    </div>

    <script src="./javascript/register.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>