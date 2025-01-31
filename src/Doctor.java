public class Doctor {
    public String doctorId;
    public String name;
    public String specialization;
    public int patientsTreated;

    public Doctor(String name, String doctorId, String specialization) {
        this.name = name;
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getPatientsTreated() {
        return patientsTreated;
    }

    public void setPatientsTreated(int patientsTreated) {
        this.patientsTreated = patientsTreated;
    }
    public void treatPatients(){
        patientsTreated += 1;
        System.out.println("Patient treated successfully. Total patients treated: " + patientsTreated);
    }
}
