package com.example.neurasecure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neurasecure.databinding.FragmentFeedBinding


class feed : Fragment() {
    private lateinit var binding: FragmentFeedBinding
    private val newsList = listOf(
        Post(
            content = "CERT-In flags critical vulnerabilities in Zoom applications, urging immediate updates. These flaws could lead to remote code execution, giving attackers complete control over affected systems. Users are advised to apply patches without delay to avoid potential exploitation. The vulnerabilities were identified in Zoom’s video conferencing tool, which is widely used for business communications. It's essential to update to the latest version to mitigate these risks. Cybersecurity experts are concerned about the ease of exploitation and the high impact on security across industries.",
            title = "Zoom Vulnerabilities: Remote Code Execution Risks and Urgent Patches",
            category = "Vulnerabilities"
        ),
        Post(
            content = "Microsoft patches exploited vulnerability in its Partner Network website and related services. This flaw, actively targeted by hackers, allows attackers to gain unauthorized access to sensitive data. The vulnerability was found in the login system, which failed to implement proper authentication checks. Hackers could use it for credential stuffing, stealing private information and compromising business systems. Microsoft’s swift response mitigates the immediate risk, but organizations must ensure they apply the patch to prevent further exploitation. This highlights the need for vigilance in securing partner portals.",
            title = "Microsoft Partner Network Exploit: Attackers Access Sensitive Data",
            category = "Malware"
        ),
        Post(
            content = "QNAP addresses multiple critical flaws in NAS and router software. These vulnerabilities, if left unpatched, could allow remote attackers to gain control over devices. The flaws impact QNAP’s devices, commonly used for data storage in small businesses. One flaw in particular enables remote command execution, allowing attackers to install malware or hijack the device. QNAP has released patches to fix the flaws, but users are urged to update their systems immediately to avoid data breaches and device hijacking. The growing threat of attacks targeting home and office routers is becoming more apparent.",
            title = "QNAP Critical Flaws: Remote Attacks on NAS and Router Devices",
            category = "Malware"
        ),
        Post(
            content = "ESET discovers a UEFI bootkit targeting Linux systems, a rare and concerning development. This bootkit is capable of bypassing traditional security measures, such as antivirus programs and secure boot protocols. It’s a sophisticated malware that remains undetected by the operating system until the computer is restarted. Once installed, the bootkit allows attackers to load malicious software at the hardware level, potentially controlling the entire system. ESET’s findings raise concerns for Linux administrators, especially those handling sensitive infrastructure. The rise of such threats shows the growing complexity and danger in targeted cyber attacks.",
            title = "Linux UEFI Bootkit: New Malware Threats for Linux Administrators",
            category = "Malware"
        ),
        Post(
            content = "ProjectSend vulnerability exploited in the wild, impacting numerous users globally. A flaw in the ProjectSend file-sharing platform allows unauthorized access to files uploaded by users. Attackers can exploit this flaw to retrieve sensitive data or inject malicious files into the platform. ProjectSend is often used by small businesses and teams to share documents, making it a prime target for attackers seeking valuable information. The vulnerability has been actively exploited, leading to concerns about the integrity of user data. Organizations that rely on this platform must patch the vulnerability to safeguard their file-sharing processes.",
            title = "ProjectSend Exploits: Sensitive Data Access via Unpatched Vulnerability",
            category = "Vulnerabilities"
        )
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFeedBinding.inflate(inflater,container,false)

        val postList = ArrayList<Post>()
        val adapter = adapter(newsList,requireContext())
        binding.recyclerid.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerid.adapter = adapter
        adapter.notifyDataSetChanged()




        return binding.root
    }


}