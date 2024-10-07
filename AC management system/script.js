function submitForm(){
    const customerName = document.getElementById("customerName").value;
    const gender = document.getElementsByName("gender").value;
    const mobileNumber = document.getElementById("mobileNo").value;
    const emailID = document.getElementById("emailID").value;
    const address = document.getElementById("address").value;
    const acType = document.getElementById("acType").value;
    const serviceType = document.getElementById("serviceType").value;
    const dateForAppointment = document.getElementById("dateForAppointment").value;
    const yearlyMaintainance = document.getElementById("yearlyMaintainance").checked;
    const duration = document.getElementById("duartion").value;
    if(!customerName || !gender || !mobileNumber || !emailID || !address || !acType || !serviceType|| !dateForAppointment){
        alert("Please fill in all required fields.");
        return;
    }
    if(!isValidEmail(emailID)){
        alert("invalid email address.");
        return;
    }
    if(!isValidMobileNumber(mobileNumber)){
        alert("invalid Mobile Number");
    }
    let serviceCharge = 0;
    switch(serviceType){
        case "Cleaning": serviceCharge=500;
        break;
        case "Reapir": serviceCharge = 1000;
        break;
        case "Gas Refill": serviceCharge = 1500;
        break; 
    }
    if(yearlyMaintainance){
        serviceCharge+=1000;
    }
    const resultDiv = doc.getElementById("result");
    if(yearlyMaintainance){
        resultDiv.innerHTML = `Hello ${customerName}, your service appointment for ${acType} AC ${serviceType} with yearly maintainance will be sent to your email ID ${emailID} and the estimated service charge will be Rs ${serviceCharge}`;
    }
    else{
        resultDiv.innerHTML = `Hello ${customerName}, your service appointment for ${acType} AC ${serviceType} without yearly maintaince will be sent to your email ID ${emailID} and the estimated service charge will be Rs ${serviceCharge}`;
    }
}
document.getElementById("submit").addEventListener("click",submitForm);
function isValidEmail(email){
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}
function isValidMobileNumber(mobileNumber){
    const mobileNumberRegex = /^[0-9]{10}$/;
    return mobileNumberRegex.test(mobileNumber);
}