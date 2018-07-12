package codesquad.service;

import codesquad.domain.Issue;
import codesquad.domain.IssueRepository;
import codesquad.dto.IssueDto;

import javax.annotation.Resource;

public class IssueService {
    @Resource(name = "issueRepository")
    private IssueRepository issueRepository;

    public Issue add(IssueDto issueDto) {
        return issueRepository.save(issueDto.toIssue());
    }

    public Issue findById(long id) {
        return issueRepository.findById(id)
                .orElseThrow(NullPointerException::new);
    }

}
