# TechSupport - Azalea Health Hackathon 2022
Problem:
After an unusually successful round of fundraising this year, the Dean of Medicine has allocated a sufficient budget that allows the IT Department of Valdosta Medicine to do a complete overhaul of the sometimes buggy and slow clinical admissions system, on the condition that it is quick, fast, secure, easy to use, and intuitive.

Preliminary Information:
Statuses
Waiting - Waiting in lobby for exam room to open up
Ready - Waiting for doctor in the exam room
In-Progress - Currently being seen by doctor or nurse
On hold - Patient in exam room waiting on doctor to return
Checked out - Patient has finished their visit

Summary:
You will need to create an application which keeps track of currently visiting patients. When patients come into the hospital's walk-in clinic, the receptionist takes the patient's information and creates a new hospital account for them (if they are new), and sets the patient's status to waiting. When existing patients return, they have their account set to waiting (since they already exist in the hospital system). Nurses who are ready to prep patients can take a waiting patient to a room, update the patient's room number, and the patient's status to ready.

While a doctor visits with a patient, their status is set to in-progress. Doctors can move the patient to a different room if necessary. While the doctor has stepped away for tests or any other reason, the patient’s status can be updated to on-hold. Patients on-hold stay on-hold until the doctor finishes the tests and returns when the status is moved back to in-progress. Once the patient checks out, their status is updated to checked out, and they are removed from the list of current patients at the hospital's walk-in clinic.

Using good software design principles, create an admission/queueing system that lets patients be entered, stored, custom sorted, searched, tracked, dismissed, and should allow changing patient information.
