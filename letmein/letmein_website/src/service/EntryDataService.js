import axios from 'axios'

const ENTRY_API_URL = 'http://localhost:8080'
const USER_API_URL = '${ENTRY_API_URL}/jobs'

class EntryDataService {

    // addEntry() {
    //     return axios.post('${USER_API_URL}');
    // }

}

export default new EntryDataService()