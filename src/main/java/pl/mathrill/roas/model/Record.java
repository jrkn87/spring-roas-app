package pl.mathrill.roas.model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Record {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private DocumentType dokumentType;
	private int dokumentNumber;
	private LocalDate date;
	@Column(nullable = false)
	private String clientName;
	private String clientNickName;
	@Column(nullable = false)
	private ShippingType shippingType;
	private String whoPacked;
	private String mistake;
	@Column(nullable = false)
	private CourierType courier;
	@Column(nullable = false)
	private String description;
	private boolean archived;
	private boolean generated;

	public Record() {
		this.date = LocalDate.now();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DocumentType getDokumentType() {
		return dokumentType;
	}
	public void setDokumentType(DocumentType dokumentType) {
		this.dokumentType = dokumentType;
	}
	public int getDokumentNumber() {
		return dokumentNumber;
	}
	public void setDokumentNumber(int dokumentNumber) {
		this.dokumentNumber = dokumentNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate() {
		this.date = LocalDate.now();
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientNickName() {
		return clientNickName;
	}
	public void setClientNickName(String clientNickName) {
		this.clientNickName = clientNickName;
	}
	public ShippingType getShippingType() {
		return shippingType;
	}
	public void setShippingType(ShippingType shippingType) {
		this.shippingType = shippingType;
	}
	public String getWhoPacked() {
		return whoPacked;
	}
	public void setWhoPacked(String whoPacked) {
		this.whoPacked = whoPacked;
	}
	public String getMistake() {
		return mistake;
	}
	public void setMistake(String mistake) {
		this.mistake = mistake;
	}
	public CourierType getCourier() {
		return courier;
	}
	public void setCourier(CourierType courier) {
		this.courier = courier;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public boolean isGenerated() {
		return generated;
	}
	public void setGenerated(boolean generated) {
		this.generated = generated;
	}
}
