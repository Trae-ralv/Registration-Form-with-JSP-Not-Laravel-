// Function to validate all inputs
function validateForm() {
    const f_name = document.getElementById('f_name').value;
    const l_name = document.getElementById('l_name').value;
    const email = document.getElementById('email').value;
    const phone_no = document.getElementById('phone_no').value;
    const password = document.getElementById('password').value;
    const c_password = document.getElementById('c_password').value;

    const isFNameValid = !/[0-9]/.test(f_name) && f_name.trim() !== '';
    const isLNameValid = !/[0-9]/.test(l_name) && l_name.trim() !== '';
    const isEmailValid = validateEmail(email);
    const isPhoneValid = validatePhone(phone_no);
    const isPasswordValid = validatePassword(password);
    const isCPasswordValid = c_password === password && c_password.trim() !== '';

    const isValid = isFNameValid && isLNameValid && isEmailValid && isPhoneValid && isPasswordValid && isCPasswordValid;

    const submitContainer = document.getElementById('submit-container');
    const submitButton = document.getElementById('submit-button');

    if (isValid) {
        submitContainer.classList.remove('text-start');
        submitContainer.classList.add('text-end');
        submitButton.textContent = 'Submit';
        submitButton.disabled = false;
    } else {
        submitContainer.classList.remove('text-end');
        submitContainer.classList.add('text-start');
        submitButton.textContent = 'Submit Disabled';
        submitButton.disabled = true;
    }
}

// Real-time validation for First Name
document.getElementById('f_name').addEventListener('input', function () {
    const f_name = this.value;
    const errorElement = document.getElementById('f_name_error');
    if (/[0-9]/.test(f_name)) {
        this.classList.add('invalid');
        errorElement.textContent = 'First Name cannot contain numbers.';
    } else {
        this.classList.remove('invalid');
        errorElement.textContent = '';
    }
    validateForm();
});

// Real-time validation for Last Name
document.getElementById('l_name').addEventListener('input', function () {
    const l_name = this.value;
    const errorElement = document.getElementById('l_name_error');
    if (/[0-9]/.test(l_name)) {
        this.classList.add('invalid');
        errorElement.textContent = 'Last Name cannot contain numbers.';
    } else {
        this.classList.remove('invalid');
        errorElement.textContent = '';
    }
    validateForm();
});

// Real-time validation for Email
document.getElementById('email').addEventListener('input', function () {
    const email = this.value;
    const errorElement = document.getElementById('email_error');
    if (!validateEmail(email)) {
        this.classList.add('invalid');
        errorElement.textContent = 'Please enter a valid email address (e.g., example@domain.com).';
    } else {
        this.classList.remove('invalid');
        errorElement.textContent = '';
    }
    validateForm();
});

// Real-time validation for Phone Number
document.getElementById('phone_no').addEventListener('input', function () {
    const phone_no = this.value;
    const errorElement = document.getElementById('phone_no_error');
    if (!validatePhone(phone_no)) {
        this.classList.add('invalid');
        errorElement.textContent = 'Please enter a valid phone number (e.g., 123-4567890).';
    } else {
        this.classList.remove('invalid');
        errorElement.textContent = '';
    }
    validateForm();
});

document.getElementById('password').addEventListener('input', function () {
    const password = this.value;
    const c_password = document.getElementById('c_password').value;
    const c_errorElement = document.getElementById('c_password_error');
    const errorElement = document.getElementById('password_error');

    // Password validation
    if (!validatePassword(password)) {
        this.classList.add('invalid');
        errorElement.textContent = 'Password must contain at least 8 characters, one uppercase letter, one lowercase letter, and one special character.';
    } else {
        this.classList.remove('invalid');
        errorElement.textContent = '';
    }

    // Confirm password validation
    const c_password_input = document.getElementById('c_password'); // Fixed: Get the element, not value
    if (c_password !== password) {
        c_password_input.classList.add('invalid'); // Fixed: classList.add, not add()
        c_errorElement.textContent = 'Passwords do not match.';
    } else {
        c_password_input.classList.remove('invalid'); // Fixed: classList.remove, not remove()
        c_errorElement.textContent = '';
    }

    validateForm();
});

// Real-time validation for Confirm Password
document.getElementById('c_password').addEventListener('input', function () {
    const c_password = this.value;
    const password = document.getElementById('password').value;
    const errorElement = document.getElementById('c_password_error');

    if (c_password !== password) {
        this.classList.add('invalid');
        errorElement.textContent = 'Passwords do not match.';
    } else {
        this.classList.remove('invalid');
        errorElement.textContent = '';
    }

    validateForm();
});

// Helper functions use in validateForm()
function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
}

function validatePhone(phone) {
    const re = /^[0-9]{3}-[0-9]{7,11}$/;
    return re.test(phone);
}

function validatePassword(password) {
    const re = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*?,]).{8,}$/;
    return re.test(password);
}

function showError(id, message) {
    document.getElementById(id).textContent = message;
}

function clearErrors() {
    const errorMessages = document.querySelectorAll('.error-message');
    errorMessages.forEach(function (error) {
        error.textContent = '';
    });
}