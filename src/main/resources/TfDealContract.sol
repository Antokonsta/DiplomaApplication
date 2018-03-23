pragma solidity ^0.4.16;
contract TfDealContract{
	address owner = msg.sender;

	uint256 id;
   	
        address importer;

	address exporter;
	
        address importerBank;

	address exporterBank;

	string dealDate;

	uint256 dealPrice;

	string dealDesc;

	bool importerSign = false;
	bool exporterSign = false;
	bool importerBankSign = false;
	bool exporterBankSign = false;
	
    //Constructor
    function TfDealContract(
	uint256 _id,
	address _importer,
	address _exporter,
        address _importerBank,
	address _exporterBank,
	string _dealDate,
	uint256 _dealPrice,
	string _dealDesc
        )
    {   
	id = _id;
        importer = _importer;
	exporter = _exporter;
	importerBank = _importerBank;
	exporterBank = _exporterBank;
	dealDate = _dealDate;
	dealPrice = _dealPrice;
	dealDesc = _dealDesc;
    }

    

    //getters

    function getId() constant returns (uint256 x)
    {
        return id;
    }

    function getImporter() constant returns (address x)
    {
        return importer;
    }

    function getExporter() constant returns (address x)
    {
        return exporter;
    }

    function getImporterBank() constant returns (address x)
    {
        return importerBank;
    }

    function getExporterBank() constant returns (address x)
    {
        return exporterBank;
    }

    function getDealPrice() constant returns (uint256 x)
    {
        return dealPrice;
    }
	
    function getDealDate() constant returns (string x)
    {
        return dealDate;
    }

    function getDealDesc() constant returns (string x)
    {
        return dealDesc;
    }

    function importerSigned() constant returns (bool x)
    {
        return importerSign;
    }

    function exporterSigned() constant returns (bool x)
    {
        return exporterSign;
    }

    function importerBankSigned() constant returns (bool x)
    {
        return importerBankSign;
    }

    function exporterBankSigned() constant returns (bool x)
    {
        return exporterBankSign;
    }
       

	modifier checkParticipant(address _account)
    {
        require(msg.sender == _account);
        _;
    }

    
    function signImporter()
	checkParticipant(importer)
  	{
	    importerSign = true;
	}

     function signExporter()
	checkParticipant(exporter)
  	{
	    exporterSign = true;
	}

     function signImporterBank()
	checkParticipant(importerBank)
  	{
	    importerBankSign = true;
	}

     function signExporterBank()
	checkParticipant(exporterBank)
  	{
	    exporterBankSign = true;
	}
	
}