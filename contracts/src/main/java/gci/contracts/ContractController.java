package gci.contracts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    @RequestMapping(method = RequestMethod.GET, value = "/contracts")
    public List<Contract> contracts() {
        ArrayList<Contract> resList = new ArrayList<Contract>();
        DataProvider data = new DataProvider();
        resList.add(data.sampleLineItemContract());
        resList.add(data.sampleServiceAgreement());
        resList.add(data.sampleServiceOrder());
        return resList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/line-item-contracts")
    public List<LineItemContract> lineItemContracts() {
        ArrayList<LineItemContract> resList = new ArrayList<LineItemContract>();
        DataProvider data = new DataProvider();
        resList.add(data.sampleLineItemContract());
        return resList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/invoices")
    public List<Invoice> invoices() {
        ArrayList<Invoice> resList = new ArrayList<Invoice>();
        DataProvider data = new DataProvider();
        resList.addAll(data.sampleLineItemContract().getRecentInvoices());
        resList.addAll(data.sampleServiceAgreement().getRecentInvoices());
        resList.addAll(data.sampleServiceOrder().getRecentInvoices());
        return resList;
    }

}
