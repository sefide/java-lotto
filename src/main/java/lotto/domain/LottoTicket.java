package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;

public class LottoTicket {
    private List<LottoNumber> lottoNumbers;

    public LottoTicket(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public static LottoTicket create(LottoTicketMaker lottoTicketMaker) {
        return lottoTicketMaker.create();
    }

    public int getMatchCountWith(List<LottoNumber> winningLottoNumbers) {
        lottoNumbers.retainAll(winningLottoNumbers);

        return lottoNumbers.size();
    }

    public List<Integer> getNumbers() {
        return lottoNumbers.stream()
                .map(LottoNumber::getNumber)
                .collect(Collectors.toList());
    }
}
