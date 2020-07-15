package com.algaworks.brewer.service.event.cerveja;

import org.springframework.util.StringUtils;

import com.algaworks.brewer.model.Cerveja;

public class CervejaSalavaEvent {

		private Cerveja cerveja;

		public CervejaSalavaEvent(Cerveja cerveja) {			
			this.cerveja = cerveja;		
		}

		public Cerveja getCerveja() {
			return cerveja;
		}	
		
		public boolean temFoto() {
			return !StringUtils.isEmpty(this.cerveja.getFoto());
		}
		
}
