package edu.cibertec.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cibertec.model.Almacenero;

import edu.cibertec.service.AlmaceneroService;

@RestController
public class AlmaceneroController {
	
	@Autowired
	private AlmaceneroService almacenservice; 
	
	@GetMapping("/login")
	public String MostrarLogin() {
		return "index";
	}
	
	@PostMapping("/login")
	public String validarLogin(@RequestParam("idalmacenero") int idalmacenero,@RequestParam("clave") String clave,Model model) {	
		
		Almacenero  almacenero = almacenservice.obtenerAlmacenero(idalmacenero);

		  if (almacenero != null && almacenero.getClave().equals(clave)) {
	            model.addAttribute("bienvenido", "¡Bienvenido, " + almacenero.getNomalmacenero() + "!");
	            return "Principal";
	        } else {
	            model.addAttribute("error", "Credenciales incorrectas");
	            return "index";
	        }
	}

	
	@PostMapping("almacenero/ingresar")
	@ResponseBody
	public Almacenero ingresarAlmacenero(@RequestBody Almacenero objAlmacenero) {
		return almacenservice.ingresarAlmacenero(objAlmacenero);
	}
	
	@PutMapping("almacenero/actualizar")
	@ResponseBody
	public Almacenero actualizarAlmacenero(@RequestBody Almacenero objAlmacenero) {
		Almacenero tmpAlmacenero=almacenservice.obtenerAlmacenero(objAlmacenero.getIdalmacenero());
		tmpAlmacenero.setNomalmacenero(objAlmacenero.getNomalmacenero());
		tmpAlmacenero.setApealmacenero(objAlmacenero.getApealmacenero());
		tmpAlmacenero.setClave(objAlmacenero.getClave());
		tmpAlmacenero.setDireccionalmacenero(objAlmacenero.getDireccionalmacenero());
		tmpAlmacenero.setDnialmacenero(objAlmacenero.getDnialmacenero());
		tmpAlmacenero.setEmail(objAlmacenero.getEmail());
		tmpAlmacenero.setTelefono(objAlmacenero.getTelefono());
		
		return almacenservice.actualizarAlmacenero(tmpAlmacenero);
	}
	
	@DeleteMapping("almacenero/eliminar/{idalmacenero}")
	@ResponseBody
	 public void eliminarAlmacenero(@PathVariable int idalmacenero ) {
		Almacenero objAlmacenero = almacenservice.obtenerAlmacenero(idalmacenero);
		 almacenservice.eliminarAlmacenero(objAlmacenero);
	}
	
	@GetMapping("almacenero/obtener/{idalmacenero}")
	public Almacenero obtenerAlmacenero(@PathVariable int idalmacenero) {
		
		return almacenservice.obtenerAlmacenero(idalmacenero);
	}
	
	
	
}
