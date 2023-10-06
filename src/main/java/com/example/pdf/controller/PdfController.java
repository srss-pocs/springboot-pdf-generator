package com.example.pdf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdf.service.GeneratePdfService;

@RestController
@RequestMapping("/api/pdf")
public class PdfController {
	
	@Autowired
	GeneratePdfService generatePdfService;

	@GetMapping("/generatePdf")
	public String generatePdf() {
		generatePdfService.generatePdf();
		return "Pdf Generated Successfully";
	}
}
