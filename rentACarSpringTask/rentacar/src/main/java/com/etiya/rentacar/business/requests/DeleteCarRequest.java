package com.etiya.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCarRequest {//id yi koymamız yeterli. direkt satır silinidi.
	private int id;
}
