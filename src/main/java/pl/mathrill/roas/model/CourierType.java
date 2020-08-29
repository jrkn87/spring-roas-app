package pl.mathrill.roas.model;

public enum CourierType {
	GLS("Kurier GLS"),
	GLS_EXC("Kurier GLS, wymiana towaru"),
	GLS_COD("Kurier GLS, pobranie przy doręczeniu"),
	GLS_PR("Kurier GLS, odbiór paczki"),
	GLS_PS("Kurier GLS, odbiór paczki i wysłanie jej dalej"),
	INPOST_KURIER("Kurier Inpost"), 
	INPOST_PACZKOMAT("Paczkomat");
	
	private String description;
	
	CourierType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
