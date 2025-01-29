import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the program
public class HospitalSystem {

    public static void main(String[] args) {
        // Create doctors
        Doctor doctor1 = new Doctor(101, "Dr. Sarah");
        Doctor doctor2 = new Doctor(102, "Dr. Hardik");

        // Create patients
        Patient patient1 = new Patient(201, "Aman");
        Patient patient2 = new Patient(202, "Adarsh");

        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Add patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Simulate consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display hospital details
        hospital.displayHospitalDetails();

        // Display individual consultations
        System.out.println("Consultation Details:");
        doctor1.displayConsultations();
        doctor2.displayConsultations();
    }
}

// Hospital class
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display hospital details
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getDoctorName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getPatientName());
        }
        System.out.println();
    }
}

// Doctor class
class Doctor {
    private int doctorId;
    private String doctorName;
    private List<Patient> consultations;

    // Constructor
    public Doctor(int doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.consultations = new ArrayList<>();
    }

    // Simulate consultation with a patient
    public void consult(Patient patient) {
        if (!consultations.contains(patient)) {
            consultations.add(patient);
            patient.addConsultation(this); // Add the doctor to the patient's consultation list
            System.out.println(doctorName + " consulted " + patient.getPatientName());
        }
    }

    // Display all consultations by the doctor
    public void displayConsultations() {
        System.out.println(doctorName + " has consulted the following patients:");
        for (Patient patient : consultations) {
            System.out.println(" - " + patient.getPatientName());
        }
        System.out.println();
    }

    // Getter for doctor name
    public String getDoctorName() {
        return doctorName;
    }
}

// Patient class
class Patient {
    private int patientId;
    private String patientName;
    private List<Doctor> consultations;

    // Constructor
    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.consultations = new ArrayList<>();
    }

    // Add a doctor to the patient's consultation list
    public void addConsultation(Doctor doctor) {
        if (!consultations.contains(doctor)) {
            consultations.add(doctor);
        }
    }

    // Getter for patient name
    public String getPatientName() {
        return patientName;
    }
}